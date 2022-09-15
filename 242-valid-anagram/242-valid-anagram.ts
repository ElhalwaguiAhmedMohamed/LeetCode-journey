function isAnagram(s: string, t: string): boolean {
    
    if(s.length != t.length)
        return false;
    
    let dict = new Map<string,number>();
    
    for(let i=0 ; i< s.length ; i++){
        dict.has(s[i]) ? dict.set(s[i], dict.get(s[i]) + 1 ) : dict.set(s[i],1);
    }
    
    for(let j=0 ; j< t.length ; j++){
        if(dict.has(t[j]))
            dict.set(t[j], dict.get(t[j]) - 1 );
    }
    
    let answer:boolean = true;
    dict.forEach((value:number , key:string)=>{
        if(value > 0)
            answer = false;
    });
    
    console.log(dict);
    return answer;
};