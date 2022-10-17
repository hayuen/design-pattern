package 커맨드패턴;

public class LightOffCommend implements Command{
    Light light;
    public LightOffCommend(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    @Override
    public void undo() {
        light.on();

    }
}
