function maxProfit(prices: number[]): number {
    let buyPriceIndex: number = 0;
    let sellPriceIndex: number = 1;
    let max_profit: number = 0;
    while(sellPriceIndex < prices.length){
        if(prices[buyPriceIndex] < prices[sellPriceIndex])
        {
            let profit = prices[sellPriceIndex] - prices[buyPriceIndex];
            
            max_profit = Math.max(max_profit , profit);
        }
        else
        {
            buyPriceIndex = sellPriceIndex;    
        }
        sellPriceIndex++;
    }
    return max_profit;
   
};