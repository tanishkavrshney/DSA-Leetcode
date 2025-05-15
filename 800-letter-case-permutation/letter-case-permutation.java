class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list=new ArrayList<>();
        call(0,new StringBuilder(),s,list);
        return list;
    }
    public void call(int index,StringBuilder path,String s,List<String> list){
        if(index==s.length()){
            list.add(path.toString());
            return;
        }
        char current = s.charAt(index);
        if(Character.isLetter(current)){
            path.append(Character.toLowerCase(current));
            call(index + 1, path, s, list);
            path.deleteCharAt(path.length() - 1); 

            path.append(Character.toUpperCase(current));
            call(index + 1, path, s, list);
            path.deleteCharAt(path.length() - 1);
        }
        else{
            path.append(current);
            call(index + 1, path, s, list);
            path.deleteCharAt(path.length() - 1); 
        }
    }
}