// Jai Mata Di
#include<bits/stdc++.h>
using namespace std;
#define lli long long int
void solveTest(){
  // (ob) - (ab) = (b-0) - (a-b) = b - a + b = 2b - a
  int a, k;
  cin>>a>>k;
  // 2b -a = k
  // a-2b = k
  int ans = 0;
  if(a<k){
    ans += (k-a);
    a = k;
  }
  if((k+a)%2==0){
    cout<<ans<<"\n";
  }
  else{
    cout<<ans+1<<"\n";
  }

}
int main(){
  ios_base::sync_with_stdio(0);
  cin.tie(0);
  cout.tie(0);
  int t, i=1;
  cin>>t;//Comment if only one test case
  while(i<=t){
    //cout<<"Case #"<<i<<": ";
    solveTest();
    i++;
  }
  return 0;
}
