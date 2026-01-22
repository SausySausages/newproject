public class Sign {

    private String message;
    private int width;

    public Sign(String message, int width){
        
        this.message = message;
        this.width = width;
    }

    public int numberOfLines(){
        
        if (message.length() == 0){
            return 0;
        }

        return (message.length() + width - 1) / width;
    }

    public String getLines(){
        
        if (message.length() == 0){
            return null;
        }

        String result = "";
        int index = 0;

        while (index < message.length()){
            
            int end = Math.min(index + width, message.length());
            result += message.substring(index, end);

            if (end < message.length()){
                result += ";";
            }

            index = end;
        }

        return result;
    }
}

