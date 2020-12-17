public class FieldFactory {

    public Field getField(String type){
        if (type.equals("water")){
            return new Water();
        }else if(type.equals("patrol boat")){
            return new ShipC("patrol boat");
        }else if(type.equals("destroyer")){
            return new ShipC("destroyer");
        }else if(type.equals("battleship")){
            return new ShipC("battleship");
        }else {
            System.out.println("you fucked up");
            return new Water();
        }
    }

}
