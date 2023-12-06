public class Password {
    private String password;
    //initialze this to be a value of 8
    private int minLength;

    public Password(String password) {
        this.password = password;
    }

    /**
     * A strong password contains at least 8 characters,
     * starts with # or !, and does not contain the
     * string "pass"
     * @return true if strong, false otherwise
     */
    public boolean strongPassword(){
        return false;
    }
}
