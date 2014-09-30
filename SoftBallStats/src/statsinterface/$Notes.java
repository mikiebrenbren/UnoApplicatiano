package statsinterface;

public class $Notes {


	//Order of sports first baseball, then football, basketball, then soccer or they need to be done at the same tim
	//can implement literally any competitive game, risk, chess, monopoly, anything!

	/*
	 * name of app ---My League---,  --Compete--, should make free initially
	 */

	/*
	 * real time updating for other individuals in the league, can be locked for only one persons control, or can be accessed
	 * by multiple people with certain permissions to the league or team they are involved with
	 * 
	 * 							ATHLETE PROFILES
	 * {
	 * each player creates a profile, each league/team manager can invite profiles of each person the team, then league managers
	 * can invite the teams to the league each layer has certain permissions, 
	 * 
	 * types of profiles, player, coach, scout, stats admin
	 * 
	 * for every game/match stats admin looks over he must be tagged to 
	 * 
	 * once athlete has accepted invite, stats can be changed for each player by the league admin
	 * 
	 * }
	 * 
	 * 								PERMISSIONS
	 * 
	 * ---one person can haver more than one adminstrative privelage ex: on person can have league, team permission and can 
	 * 			also be a player.
	 * 		{
	 * league admin can edit stats, games played, wins/losses, scheduling
	 * team admin can edit players 
	 * player can only edit own profile
	 * --create coach profiles(ratings by players)
	 * 
	 * }
	 * 
	 * 								FUNCTIONALITY
	 * {
	 * 
	 * real time statistical updates from person creating watching games/matches/tournaments 
	 * graphs for each statistic(with graphs comes many more details)
	 * 
	 * trending top teams, top players in upper leagues, high school, college, everything.
	 * 
	 * 
	 * this could be an app for all of little league, can have stats for each team, and each player for each team, scheduled games, record 
	 * for each team
	 * ---going to have to separate softball from baseball stats make possibly compatible with iphone, for now just use android
	 * 
	 * stats for whole league and each game
	 * --keeps track of winners or losers
	 * can be made for tournements, have brackets, can have option to have multiple leagues tourneys etc
	 * (age groups/ description of each league)
	 * 
	 * 
	 * made for other sports such as football, hockey, etc
	 * 
	 * make it nicer, make it better, make it more effecient, try and use multi-threading if possible(cannot think of why I would use
	 * it yet)
	 *
	 * need to make it compatible with apple.
	 * 
	 * notifications when a player recieves an update on their stats
	 * 
	 * ability to lock games forever after stats have been entered, increase credibility
	 * 
	 * --geo location is going to be crutial need search engine to find teams within local or global landsape
	 * }
	 * 
	 * 								SOCIAL
	 * 
	 * {
	 * 
	 * sharing profile with facebook twitter etc
	 * young athletes become stars
	 * easily see best profile stats in region, city, country, world
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 								IMPACT
	 * {
	 * 
	 * scouting for players has just got a lot easier
	 * ability to spot talent early on, see early trends and hone athletic abilities, work on weaknesses 
	 * competing becomes a global social phenomenon not just for pro athletes but for every age/talent level and every sport
	 *
	 * }
	 * 
	 * 							POSSIBLE DRAWBACKS
	 * 
	 * { 
	 * 
	 * smaller leagues with less reputation, stats can be easily manipulated 
	 * --this could be slightly mitigated using the blockchain, time stampings statistics 
	 * 
	 * }
	 * 
	 * 
	 */




	//look into fetching data from every game to keep an updated score of every game.




	/*
	 * 							*****DESIGN NOTES****
	 * 
	 * 
	 * 						PLAYER PROFILES
	 * 
	 *  --stats editable by league creator only
	 *  --must not be able to edit overall history, can only change the history within its scope ie only new games not past ones
	 *  --need stats class for overall profile stats and game stats, after each game data gets added to overall
	 *  
	 *  
	 *  
	 *  						GAME AND PLAYER HISTORY
	 *  --need to keep history of each game score and stats of each player, where each out occured, where each hit occured
	 *  --keep history of batting order for each game
	 *  
	 *  						
	 *  
	 *  						SUBMITTING STATS
	 *  --once admin submits stats, they are not editable, so must make sure that all stats have been entered correctly before seding them in
	 *  --player should have an oportunity to debate whether stats are accurate(possible but not sure how to implement)
	 *  
	 * 
	 * 
	 * 							PROFILE INFORMATION
	 * 
	 * --history of adminstered games and leagues, reviews of how well admin was carried out, ie whether stats were accurate and fair
	 * 
	 * 
	 * 							ACTIVE GAME PLAY MODE FOR ADMIN
	 * --needs an elegent and sleek design to move through each player 
	 * 
	 * 							MULTITHREADING 
	 * --this needs to be implimented, stats can be on a thread, game play can be on another thread
	 * 
	 * 
	 * 
	 * 							USING THE BLOCKCHAIN
	 * --when records are recorded they should be time stamped in the blockchain to confirm it actually happened
	 * --can do this on multiple blockchains to be sure that record has another layer of reduncy ie ethereum 
	 * --thsi could cost a bit of money, so this must be an option to confirm credibility
	 * 
	 */







}
