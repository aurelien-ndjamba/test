package tourGuide.rewards.modele;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitedLocation {
	
	public UUID userId;
	public Location location;
	public Date timeVisited; 

}
