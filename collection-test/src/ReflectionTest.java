import java.lang.reflect.Method;

public class ReflectionTest {

    private int variable1;

    private int variable2;

    public ReflectionTest() {
        this.variable1 = 12;
        this.variable2 = 13;
    }

    public void setVariable1(int variable1) {
        this.variable1 = variable1;
    }

    public void setVariable2(int variable2) {
        this.variable2 = variable2;
    }

    public int getVariable1() {
        return variable1;
    }

    public int getVariable2() {
        return variable2;
    }

    public static void main(String[] args) {

//        ReflectionTest reflectionTest = new ReflectionTest();

        try{
            Class clazz = Class.forName("ReflectionTest");
            Method[] methods = clazz.getMethods();
            for (Method method: methods){
                System.out.println(method.toString());
            }
            Object obj = clazz.newInstance();
            System.out.println(obj.toString());

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }

}
