module Main where

offer :: Integral a => [a] -> a
offer [n, k] = mod n k + div n k

main :: IO ()
main = do
  contents <- getContents
  mapM_ putStrLn $ map (show . offer) $ map (map read) $ map words (tail $ lines contents)
