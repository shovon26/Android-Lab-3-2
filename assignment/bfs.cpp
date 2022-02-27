#include<bits/stdc++.h>
using namespace std;

void print_board(vector <int> board) {
    int n = board.size();
    string border = "";
    for(int j = 1; j <= n; j++) 
        border += "|---";
    border += "|";
    cout << border << endl;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            string s = "|   ";
            if(board[i - 1] == j - 1) {
                s[2] = 'Q';
            }
            cout << s;
        }
        cout << "|" << endl;
        cout << border << endl;
    }
}

bool check(vector <int> p) {
    int n = p.size();
    for(int i = 0; i < n; i++)
    for(int j= i + 1; j < n; j++)
        if((p[i] == p[j]) || (i + p[i]) == (j + p[j]) || (i - p[i] == j - p[j]))
            return false;
    return true;
}

vector<int> bfs(int n) {
     stack <pair<int, int>>st;
     vector<int>res;
     for(int i = 0;i < n; i++) st.push({i, 0});
     while(!st.empty()){
         auto cur = st.top();
         st.pop();
         while(res.size() > cur.second) res.pop_back();
         res.push_back(cur.first);
         if(!check(res)) res.pop_back();
         else{
            if(res.size() == n)break;
             for(int i = 0; i < n; i++){
                 if(abs(i - cur.first) < 2)continue;
                 st.push({i,cur.second + 1});
             }
         }
     }
     return res;
}

int main(int argc, char* argv[]) {
    int n = stoi(argv[1]);
    auto ans=bfs(n);
    //print_board(ans);
}
