
package Repository;

import DataAccess.WorkerManagementDao;


public class WorkerRepository implements IWorkerRepository {
    @Override
    public void addWorker() {
    WorkerManagementDao.Instance().createWorker();
    }

    @Override
    public void changeSalary(String action) {
    WorkerManagementDao.Instance().changeSalary(action);
    }

    @Override
    public void getInfomationSalary() {
    WorkerManagementDao.Instance().getInformationSalary();
    }
    
}
