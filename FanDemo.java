public class FanDemo<T> {
    T tool ;

    public T getTool() {
        return tool;
    }

    public void setTool(T tool) {
        this.tool = tool;
    }

    public void show(T t){
        System.out.println(t);
    }
}
