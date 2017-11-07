package BS.old.Agents;

import BS.game.agents.CombatAttributes;

/**
 * Um Agent é a classe base para todos e qualquer alvo em batalhas, incluindo jogador, personagens e inimigos.
 * @since 19/10/17
 * @author Bruno Cesar
 */
public class Agent {

    /**
     * Basic constructor, works for scenario objects
     */
    public Agent(String name, int HP, AgentType type) {
        this.name = name;
        this.attributes = new CombatAttributes();
        this.attributes.setHP(HP);
        this.type = type;
    }

    //Basic attributes
    protected String name;
    protected int lvl;
    private boolean[] states;
    private AgentType type;
    private CombatAttributes attributes; //(All used in battles)

    public void damage(float dmg){
        this.attributes.setHP(this.attributes.getHP() - dmg);
        if (this.attributes.getHP() <= 0){
            states[AgentState.DEAD.getId()] = true; //???? Retrabalhar isso
        }
    }

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public boolean[] getStates() {
        return states;
    }

    public AgentType getType() {
        return type;
    }

    public CombatAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CombatAttributes attributes) {
        this.attributes = attributes;
    }
}
