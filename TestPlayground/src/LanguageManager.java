public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() {
        if (language != null){
            return language;
        }else {
            return Language.UNSET;
        }

    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void changeLanguage(String newLanguague){
        switch (newLanguague){
            case "cs":
                setLanguage(Language.CESTINA);
                break;
            case "en":
                setLanguage(Language.ENGLISH);
                break;
            default:
                System.out.println("Invalid language");
                break;
        }
    }
}
