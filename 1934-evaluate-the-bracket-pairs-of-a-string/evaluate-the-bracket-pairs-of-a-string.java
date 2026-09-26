class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        Map <String,String> map = new HashMap<>();

        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }


        StringBuilder str = new StringBuilder();
        StringBuilder key = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='('){
                str.append(s.charAt(i));
                continue;
            }
            
            i++;
            while(s.charAt(i)!=')'){
                key.append(s.charAt(i));
                i++;
            }
            if(map.get(key.toString())==null){
                str.append('?');
                key.setLength(0);
                continue;
            }
            str.append(map.get(key.toString()));
            key.setLength(0);
        }
        
        return str.toString();
    }
}