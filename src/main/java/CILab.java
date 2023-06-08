public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        if(myString == null)
            return false;

        String result = myString.toUpperCase();

        if(result.equals(""))
            return false;

        if(Character.isUpperCase(myString.charAt(0))){
            return true;
        } else {
            return false;
        }

    }

}

