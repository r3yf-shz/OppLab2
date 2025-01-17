public class ChildName extends Name {
    private String operator;

    public ChildName(int hours, int minutes, int seconds, String operator) {
        super(hours, minutes, seconds);
        this.operator = operator;
    }

	//Добавил isPrivilegedTime
	
    public boolean isPrivilegedTime() {
        return getHours() >= 0 && getHours() < 8;
    }

    @Override
    public String toString() {
        return super.toString() + ", operator: " + operator + ", privileged time: " + isPrivilegedTime();
    }
     public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
