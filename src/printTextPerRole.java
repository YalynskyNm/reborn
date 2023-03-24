public class printTextPerRole {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            roles[i] = roles[i] + ":";
            string.append(roles[i]);
            string.append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i])) {
                    string.append(j+1);
                    string.append(") ");
                    string.append(textLines[j].substring(roles[i].length()+1));
                    string.append("\n");
                }
            }
            string.append("\n");
        }

        return string.toString();
    }
}
