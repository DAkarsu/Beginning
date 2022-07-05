package UseCompareTo;

public  class Employee implements Comparable{
    public int no;
    public String name;

    public Employee(int no, String name) {
        this.no = no;
        this.name = name;
    }


    @Override
    public int compareTo(Object o) {

        if(o instanceof Employee e){
            if(no < e.no){
                return -1;
            }else if( no == e.no){
                return 0;
            }
        }
        return 1;
    }
}
