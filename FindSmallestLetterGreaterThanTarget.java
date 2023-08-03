public class FindSmallestLetterGreaterThanTarget {
        public static char nextGreatestLetter(char[] letters, char target) {
            int start=0,end=letters.length-1;
            int mid;
            while(start<=end){
                mid=start+(end-start)/2;
                if(target<letters[mid])
                end=mid-1;
                else 
                start=mid+1;
            }
            return letters[start % letters.length];
        }
        public static void main(String[] args) {
            char[] letters={'c','f','j'};
            char target='c';
            System.out.println(nextGreatestLetter(letters,target));
        }
}
