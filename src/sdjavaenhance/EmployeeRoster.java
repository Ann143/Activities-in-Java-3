
package sdjavaenhance;

import EmployeeSalary.*;



public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;

    public EmployeeRoster() {
        this(10);
    }

    public EmployeeRoster(int max) {
        this.max = max;
        empList = new Employee[this.max];
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
   
    private boolean isFull() {
        return count == max;
    }

   
    public boolean addEmployee(Employee e){
         if (!isFull()) {
            this.empList[this.count++] = e;
            return true;
        }
        return false;
    }
    
    
    
    
    
    /**
     *@param id as the employee id to be deleted
     * @return the employee deleted in the case where there is no employee return null
     */
//    public Employee removeEmployee(int id) {
//    Employee e = null;
//        int index = searchProductID(prodID);
//
//        if (index >= 0) {
//            e = empList[index];
//            for (int i = index; i < count - 1; ++i) {
//                empList[i] = empList[i + 1];
//            }
//            count--;
//        }
//       return i;
//    }
// 
   
   
    public int countHE() {
        int ctr = 0;
        for(int i=0;i<count;++i){
            if(empList[i].getType()=="HE"){
                ctr++;
            }
        }
        return ctr;
    }

    public int countPWE() {
        int ctr=0;
        for(int i=0;i<count;++i){
            if(empList[i].getType()=="PWE"){
                ctr++;
            }
        }
        
        return ctr;
    }

    public int countCE() {
      int ctr=0;
        for(int i=0;i<count;++i){
            if(empList[i].getType()=="CE"){
                ctr++;
            }
        }
        return ctr;
    }

    public int countBPCE() {
       int ctr=0;
        for(int i=0;i<count;++i){
            if(empList[i].getType()=="BPCE"){
                ctr++;
            }
        }
        return ctr;
    }

    public void empCount(){
        System.out.printf(" %-10s | %-15s | %-15s | %-15s \n", "Hourly", "PieceWorker", "Commission", "BaseCommission");

        System.out.printf(" %-10d | %-15d | %-15d | %-15d  \n",
                  countHE(), countPWE(), countCE(), countBPCE());
    }
    
    
    public void summary(){
    System.out.printf(" %-10s | %-20s | %-15s | %-20s \n", "ID", "NAME", "SALARY", "TYPE");
    for(int i=0; i<count; i++){
        System.out.printf(" %-10d | %-20s | Php%12.2f | %-20s \n",
                    empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getSalary(),empList[i].getType());
    }
   
    }
    /**
     *       ID | NAME | SALARY | TYPE
     */
    
     @Override
    public String toString() {
        return "ProductList{" + "list=" + empList + ", count=" + count + ", max=" + max + '}';
    }
}
