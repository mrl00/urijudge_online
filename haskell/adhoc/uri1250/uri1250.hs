module Main where

take3 [] = []
take3 all@(x:xs) = take 3 all : take3 (drop 3 all)

fi [a@(n:ns), b@(l:ls)] = zip (map read (words a) :: [Int]) b

ans k [] = k
ans k ((n,c):xs) 
	| (c == 'S' && (n == 1 || n == 2)) || (c == 'J' && n > 2) = ans (k + 1) xs
	| otherwise = ans k xs 

main :: IO ()
main = do
	contents <- getContents
	mapM_ (putStrLn . show) $ map (ans 0) (map (fi . drop 1) $ take3 . tail $ lines contents)  

