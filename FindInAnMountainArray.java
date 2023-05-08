public class FindInAnMountainArray {
    interface MountainArray {
        public int get(int index);
            public int length();
         }
    public static int findInMountainArray(int target, MountainArray mountainArr) {
   
        int peak=findPeak(mountainArr);
              int asc=ascending(mountainArr,target,peak);
              int desc=descending(mountainArr,target,peak);
              if(mountainArr.get(peak)==target){
                  return peak;
              }
          if(asc!=-1){
            return asc;
        }
          else if(desc!=-1){
            return desc;
        }
        else if(desc!=-1 && asc!=-1){
            return Math.min(desc,asc);
        }
      
      
        return -1;
      }
      public static int findPeak(MountainArray arr){
          int l=0;
          int h=arr.length()-1;
          while(l<=h){
              int mid=l+(h-l)/2;
                      int midEle=arr.get(mid);
              if(midEle>arr.get(mid+1) && midEle>arr.get(mid-1)){
                  return mid;
              }
              else if(midEle<arr.get(mid+1)){
                  l=mid+1;
              }
              else{
                  h=mid-1;
              }
          }
          return -1;
      }
          public static int ascending(MountainArray arr,int target,int peak){
          int l=0;
          int h=peak-1;
          
          while(l<=h){
              int mid=l+(h-l)/2;
                          int midEle=arr.get(mid);
              if(midEle==target){
                  return mid;
              }
              else if(midEle>target){
                  h=mid-1;
              }
              else{
                  l=mid+1;
              }
          }
          return -1;
      }
          public static int descending(MountainArray arr,int target,int peak){
          int l=peak;
          int h=arr.length()-1;
          while(l<=h){
              int mid=l+(h-l)/2;
                          int midEle=arr.get(mid);
              if(midEle==target){
                  return mid;
              }
              else if(midEle>target){
                  l=mid+1;
              }
              else{
                  h=mid-1;
              }
          }
          return -1;
      }
}
