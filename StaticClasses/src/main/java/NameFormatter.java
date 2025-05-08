public class NameFormatter {

    public static String format(String fullName) {

        String[] nameParts = fullName.split(" ");
        String prefix = nameParts[0];
        String firstName = nameParts[1];
        String middleName = nameParts[2];
        String lastName = nameParts[3];
        String suffix = nameParts[4];

        String formattedName = "";

        if (!lastName.equalsIgnoreCase("null")) {
            formattedName += lastName + ", ";
        }
        if (!prefix.equalsIgnoreCase("null")) {
            formattedName += prefix + " ";
        }
        if (!firstName.equalsIgnoreCase("null")) {
            formattedName +=  firstName + " ";
        }
        if (!middleName.equalsIgnoreCase("null")) {
            formattedName += middleName;
        }
        if (!suffix.equalsIgnoreCase("null")) {
            formattedName += ", " + suffix;
        }
        return formattedName;
    }
}
