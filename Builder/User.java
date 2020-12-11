public class User {

    public static class Builder {

        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private int age;
        private int phone;
        private boolean gender;

        public Builder(String userName,String password){
            this.userName = userName;
            this.password = password;
        }

        public Builder fName(String name){
            this.firstName = name;
            return this;
        }
        public Builder lName(String name){
            this.lastName = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder phone(int phone){
            this.phone = phone;
            return this;
        }
        public Builder gender(boolean gender){
            //zdenek jde do vezeni xd
            this.gender = gender;
            return this;
        }

        public User build(){
            User user = new User();
            user.userName = this.userName;
            user.password = this.password;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.age = this.age;
            user.phone = this.phone;
            user.gender = this.gender;

            return user;

        }

    }
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private int phone;
    private boolean gender;
    private User(){
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", gender=" + gender +
                '}';
    }
}
