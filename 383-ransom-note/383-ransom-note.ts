function canConstruct(ransomNote: string, magazine: string): boolean {
    let dict = new Map<string,number>();
    
    for(let i=0 ; i< ransomNote.length ; i++){
        dict.has(ransomNote[i]) ? dict.set(ransomNote[i], dict.get(ransomNote[i]) + 1 ) : dict.set(ransomNote[i],1);
    }
    
    for(let j=0 ; j< magazine.length ; j++){
        if(dict.has(magazine[j]))
            dict.set(magazine[j], dict.get(magazine[j]) - 1 );
    }
    
    let answer:boolean = true;
    dict.forEach((value:number , key:string)=>{
        if(value > 0)
            answer = false;
    });
    
    console.log(dict);
    return answer;
};