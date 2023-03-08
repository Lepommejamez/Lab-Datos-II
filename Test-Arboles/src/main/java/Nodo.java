import java.util.ArrayList;

public class Nodo 
{
    private int id;
    private String name;
    ArrayList<Nodo> hijos = new ArrayList<>();
    ArrayList<Nodo> datos = new ArrayList<>();
    
    //Constructor
    public Nodo(String data, int id){
        this.name = data;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
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
    
    public void addChild(String text, int id)
    {
        Nodo node = new Nodo(text, id);
        addChild(node);
    }
}

