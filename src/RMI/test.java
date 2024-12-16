package RMI;

public class test {

    static String processStudentCode(String rqName) {
        StringBuilder code = new StringBuilder();
        String enrollYear = String.valueOf("2022");
        code.append("B").append(enrollYear.substring(enrollYear.length() - 2));
        String name = processStudentName(rqName);
        String[] stream = name.split("\\s+");
        code.append(stream[stream.length - 1].toUpperCase()).append("_");
        for(int i = 0; i < stream.length - 1; i++) {
            code.append(stream[i].substring(0, 1).toUpperCase());
        }
        return code.toString();
    }

    static String processStudentName(String rqName) {
        String[] str = rqName.split("\\s+");
        StringBuilder name = new StringBuilder();
        for(int i = 0; i < str.length - 1; i++) {
            name.append(str[i].substring(0, 1).toUpperCase())
                    .append(str[i].substring(1).toLowerCase())
                    .append(" ");
        }
        return name.append(str[str.length - 1].toUpperCase()).toString();
    }
    public static void main(String[] args) {
        String input = "nguYEn van tAi tUAN";
        System.out.println(processStudentName(input));
    }
}
