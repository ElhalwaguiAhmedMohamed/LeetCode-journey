function generate(numRows: number): number[][] {
    let ans: number[][] = [[1]];
    
    for(let i = 0; i< numRows-1 ; i++){
        let x = ans[ans.length -1];
        let row = [1];
        for(let j=1 ; j<x.length ;  j++){
            row.push(x[j] + x[j-1]);
        }
        row.push(1);
        ans.push(row);
    }
    return ans;
};