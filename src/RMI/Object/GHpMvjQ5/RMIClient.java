package RMI.Object.GHpMvjQ5;

import RMI.ObjectService;
import RMI.Student;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    static String processStudentCode(Student student) {
        StringBuilder code = new StringBuilder();
        String enrollYear = String.valueOf(student.getEnrollmentYear());
        code.append("B").append(enrollYear.substring(enrollYear.length() - 2));

        String name = processStudentName(student);
        String[] nameParts = name.split("\\s+");

        code.append(nameParts[nameParts.length - 1].toUpperCase());
        code.append("_");

        for (int i = 0; i < nameParts.length - 1; i++) {
            code.append(nameParts[i].substring(0, 1).toUpperCase());
        }

        return code.toString();
    }

    static String processStudentName(Student student) {
        String[] str = student.getName().split("\\s+");
        StringBuilder name = new StringBuilder();
        for(int i = 0; i < str.length - 1; i++) {
            name.append(str[i].substring(0, 1).toUpperCase())
                    .append(str[i].substring(1).toLowerCase())
                    .append(" ");
        }
        return name.append(str[str.length - 1].toUpperCase()).toString().trim();
    }

    public static void main(String[] args) throws Exception {
        String serverAddress = "203.162.10.109";
        int registryPort = 1099;
        String serviceName = "RMIObjectService";
        String studentCode = "<MSV>";
        String qCode = "GHpMvjQ5";

        Registry registry = LocateRegistry.getRegistry(serverAddress, registryPort);
        ObjectService objectService = (ObjectService) registry.lookup(serviceName);
        Student student = (Student) objectService.requestObject(studentCode, qCode);
        System.out.println(student);
        student.setCode(processStudentCode(student));
        student.setName(processStudentName(student));
        System.out.println(student);
        objectService.submitObject(studentCode, qCode, student);
    }
}
