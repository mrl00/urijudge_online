module Main where

main :: IO ()
main = getContents >>= mapM_ putStrLn . flip replicate "gzus" . (length . lines)
