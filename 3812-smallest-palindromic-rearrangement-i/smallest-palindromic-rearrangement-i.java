class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int halflength=n/2;
        char[] half=s.substring(0,halflength).toCharArray();
        Arrays.sort(half);
        StringBuilder sb=new StringBuilder();
        String firsthalf=new String(half);
        sb.append(firsthalf);
        if(n%2!=0){
            sb.append(s.charAt(halflength));
        }
        sb.append(new StringBuilder(firsthalf).reverse().toString());
        return sb.toString();
        
    }
}