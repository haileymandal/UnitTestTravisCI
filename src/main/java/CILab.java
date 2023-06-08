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

        if(myString.equals(""))
            return false;

        for(String word : myString.split(" ")){
            if(Character.isUpperCase(word.charAt(0))){
                return true;
            }
        }
        return false;
    }

}

