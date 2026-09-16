#include<iostream>
#include<string>
#include<unordered_set>
#include<algorithm>
class Solution {
public:
    int lengthOfLongestSubstring(std::string s) {
        std::unordered_set<char>charSet;
        int left=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            while(charSet.count(s[i])){
            charSet.erase(s[left]);
            left++;
        }
        charSet.insert(s[i]);
        max=std::max(max,i-left+1);

        

        }
        return max; 
    }
};