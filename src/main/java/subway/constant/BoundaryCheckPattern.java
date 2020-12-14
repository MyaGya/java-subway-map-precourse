package subway.constant;

public enum BoundaryCheckPattern {
    MAIN_MENU_OPTION_LIMIT("[1234Q]{1}")
    ;
    private final String pattern;

    BoundaryCheckPattern(String pattern){
        this.pattern = pattern;
    }

    public String getRegexBoundaryCheckPattern(){
        return this.pattern;
    }
}
