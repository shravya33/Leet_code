import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    [rows,col] = players.shape
    return [rows,col]