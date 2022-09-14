function matrixReshape(mat: number[][], r: number, c: number): number[][] {
    if(mat.length * mat[0].length != r*c)
        return mat;
    
    const output = new Array(r).fill(0).map(() => new Array(c).fill(0));
    
    for(let idx=0 ; idx< r*c ; idx++){
        output[Math.floor(idx/c)][idx % c] = mat[Math.floor(idx / mat[0].length)][idx % mat[0].length];
    }
    return output;
};