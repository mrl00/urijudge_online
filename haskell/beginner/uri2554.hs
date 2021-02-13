module Main where

checkEachDate :: [String] -> Bool
checkEachDate all@(l:ls) = (foldl (\acc x -> acc || checkDate (words x)) False all)
    where checkDate (s:ss) = (foldl (\acc x -> acc && x == "1") True ss)


main :: IO ()
main = do
    -- contents <- getContents
    putStrLn ""
