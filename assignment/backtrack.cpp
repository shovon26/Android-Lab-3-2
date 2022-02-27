#include <bits/stdc++.h>
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

int cnt = 0;

bool backtrack(int i, vector <int> &p) {
    int n = p.size();
    ++cnt;
    if(i >= n) {
        print_board(p);
        return true;
    }
    
    for(int j = 0; j < n; j++) {
        p[i] = j;
        int flag = true;
        for(int l = 0; l < i; l++) { 
            if((p[l] == p[i]) || (l + p[l]) == (i + p[i]) || (l - p[l] == i - p[i])) {
                flag = false;
            }
        }
        if(flag && backtrack(i + 1, p)) return true;
    }
    return false;
}

int main() {
    int n; cin >> n;
    vector <int> p(n);
    backtrack(0, p);
}
