module Main where

isPrime :: Integer -> Bool
isPrime n = n > 1 && noDivs n primesTD
  where
    noDivs n ds = foldr (\d r -> d*d > n || (rem n d > 0 && r)) True ds
    primesTD  = 2 : 3 : filter (`noDivs` tail primesTD) [5,7..]

--[5,1,2,3,4,5,2,5,1,2,3,4,5,3]
fixed :: [Int] -> [[Int]]
fixed [] = []
fixed all@(n:ns) = [k | k <- numbers seq salt] : fixed (drop (n + 1) ns)
    where 
      salt = (all !! (n + 1))
      seq = reverse $ take n ns
      numbers [] s = []
      numbers nb@(x:xs) s = x : numbers (drop s nb) s
  
    

dp :: [Int] -> [String]
dp inp@(k:ks) = map (ans . isPrime . fromIntegral . sum) $ fixed inp
  where
    ans False = "Bad boy! I’ll hit you."
    ans True  = "You’re a coastal aircraft, Robbie, a large silver aircraft."
    

main :: IO ()
main = do
  contents <- getContents
  mapM_ putStrLn $ dp (map read [x | x <- (lines contents), length x > 0] :: [Int])
  
