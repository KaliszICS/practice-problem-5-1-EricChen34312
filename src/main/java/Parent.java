import java.util.ArrayList;
import java.util.Arrays;

public class Parent extends Person {
    private Parent spouse = null;
    private Child[] children = new Child[0];

    public Parent(String name, int age){
        super(name,age);
    }

    public Parent(String name, int age, Parent spouse){
        super(name,age);

        this.spouse = spouse;
    }

    public void setSpouse(Parent spouse){
        this.spouse = spouse;
    }

    public Parent getSpouse(){
        return this.spouse;
    }

    public void setChildren(Child[] children){
        this.children = children;
    }

    public void addChild(Child child){
        ArrayList<Child> children = new ArrayList<>(Arrays.asList(this.children));
        children.add(child);

        this.children = children.toArray(new Child[0]);
    }

    public Child[] getChildren(){
        return this.children;
    }
}
