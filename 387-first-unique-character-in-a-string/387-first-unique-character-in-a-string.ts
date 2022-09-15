function firstUniqChar(s: string): number {
    let dict = new Map<string,number>();

    for(let i=0 ; i< s.length ; i++){
        if(dict.has(s[i]))
            dict.set(s[i], dict.get(s[i])+1);
        else
            dict.set(s[i],1);
    };
    
    let letters = [...dict.entries()]
        .filter(({ 1: v }) => v === 1)
        .map(([k]) => k);
    
    return s.indexOf(letters[0]);
};