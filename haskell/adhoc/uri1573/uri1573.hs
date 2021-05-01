module Main where

choc [a,b,c] = floor $ cbrt (a*b*c)
	where cbrt x = x**(1/3)

main :: IO ()
main = do
	contents <- getContents
	mapM_ (putStrLn . show) $  map choc ((map ((map read) . words) (init $ lines contents)) :: [[Double]])
