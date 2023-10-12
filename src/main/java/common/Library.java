
package common;

import java.util.ArrayList;
import model.Worker;


public class Library {
        // Check if a worker with the given id exists in the list.
    public static boolean checkIdExist(ArrayList<Worker> lw, String id) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())) {
                return true;
            }
        }
        return false;
    }
        // Check if a worker is not a duplicate.
    public static boolean checkWorkerExist(ArrayList<Worker> lw, String id, String name, int age, int salary, String workLocation) {
        for (Worker worker : lw) {
            if (id.equalsIgnoreCase(worker.getId())
                    && name.equalsIgnoreCase(worker.getName())
                    && age == worker.getAge()
                    && salary == worker.getSalary()) {
                return false;
            }
        }
        return true;
    }
    
}
