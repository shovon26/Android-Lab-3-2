#include<bits/stdc++.h>
using namespace std;

vector<int>p;
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

bool check(int n) {
    for(int i = 0; i < n; i++)
    for(int j= i + 1; j < n; j++)
        if((p[i] == p[j]) || (i + p[i]) == (j + p[j]) || (i - p[i] == j - p[j]))
            return false;
    return true;
}

bool dfs(int c,int n) {
    if(c==n) return check(n);
    for(int i = 0; i < n; i++) {
        if(c > 0 && (abs(p[c - 1] - i) < 2)) continue;
        p[c] = i;
        if(dfs(c + 1, n))
            return true;
    }
    return false;
}

int main() {
     int n; cin >> n;
     p.resize(n, 0);
     dfs(0,n);
     print_board(p);
     return 0;
}
