public class SimpleContext {
    private String key;
    private String value;

    public void put(String key,String value)
    {
        this.key=key;
        this.value=value;
        System.out.println("Stored key: "+ key + ", Value:  "+ value);
    }

    public String get(String key)
    {
        if(this.key.equals(key))
        {
            return this.value;
        }
        else
        {
            return "Key not found :";
        }
    }

    
}
