import java.util.ArrayList;

public class Nodo {
    private String nombre;
    ArrayList<Nodo> hijos = new ArrayList<>();
    
    public Nodo(String data){
        this.nombre = data;
    }

    public String getData(){
        return nombre;
    }

    public Nodo getChild(int i)
    {
        try
        {
            return hijos.get(i);
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
    public ArrayList getChildren()
    {
        return hijos;
    }
    
    public void addChild(Nodo nodo)
    {
        hijos.add(nodo);
    }
    
    public void addChild(String text)
    {
        Nodo node = new Nodo(text);
        addChild(node);
    }
}


