
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;




class GeoReading
{

    BigDecimal localDate = null;
    BigDecimal latitude = null;
    BigDecimal longitude = null;
    BigDecimal depth = null;
    BigDecimal magnitude = null;

    public GeoReading( String arg )
    {
        // String is comma-separated values of: Date,Lat,Lon,Depth,Mag
        List<String> items = Arrays.asList( arg.split( "\\s*,\\s*" ) ); // Regex explained here: http://stackoverflow.com/a/7488676/642706
        this.localDate = new BigDecimal ( items.get( 0 ) );
        this.latitude = new BigDecimal( items.get( 1 ) );
        this.longitude = new BigDecimal( items.get( 2 ) );
        this.depth = new BigDecimal( items.get( 3 ) );
        this.magnitude = new BigDecimal( items.get( 4 ) );
    }

    @Override
    public String toString()
    {
        return "{" + "Date=" + localDate + ", latitude=" + latitude + ", longitude=" + longitude + ", depth=" + depth + ", magnitude=" + magnitude + '}';
    }
 

}