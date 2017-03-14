class boardPieces
{
    protected int hexNumber;  

    public boardPieces(int hnumber)
    {
        hexNumber = hnumber;
    }
}

class roads
{
    private int edgeNumber;

    public roads(int hnumber, int edge)
    {  
        super();
        edgeNumber = edge;
    }

    public void deployRoad(int playerRoadPlacement)
    {
        edgeNumber = playerRoadPlacement;
    }
}

class settlements
{
    private int vertexNumber;

    public settlements(int hnumber, int vertex)
    {
        super();
        vertexNumber = vertex;
    }

    public void deploySettlement(int playerSettlementPlacement)
    {
        vertexNumber = playerSettlementPlacement;
    }
}

class cities
{
    private int vertexNumber;

    public cities(int hnumber, int vertex)
    {
        super();
        vertexNumber = vertex;
    }

    public void upgradeSettlement(settlements s1)
    {
        //Do function here;
    }
}

class robber
{
    public robber(int hnumber)
    {
        super();
    }
}
