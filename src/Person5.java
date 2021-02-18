public class Person5 {
private Job job; //composition HAS-A Relationship(if job class deleted then there is no use of person5 class)
Person5(){
this.job=new Job();
job.setSalary(3000);
job.setId(101);
job.setRole("manager");
}
public void display() {
System.out.println(job.getId()+" "+job.getRole()+" "+job.getSalary());
}
}