package com.yellowbrossproductions.illageandspillage;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Config {
    public static final ForgeConfigSpec clientSpec;
    public static final ClientConfig CLIENT;
    public static final ForgeConfigSpec commonSpec;
    public static final CommonConfig COMMON;

    static {
        Pair<ClientConfig, ForgeConfigSpec> specPair1 = new ForgeConfigSpec.Builder().configure(ClientConfig::new);
        clientSpec = specPair1.getRight();
        CLIENT = specPair1.getLeft();
        Pair<CommonConfig, ForgeConfigSpec> specPair2 = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
        commonSpec = specPair2.getRight();
        COMMON = specPair2.getLeft();
    }

    public static class ClientConfig {
        public static ForgeConfigSpec.BooleanValue cameraShakesAllowed;
        public static ForgeConfigSpec.BooleanValue webbedScreen;
        public static ForgeConfigSpec.BooleanValue doJumpscare;
        public static ForgeConfigSpec.BooleanValue arachnophobeMode;

        public ClientConfig(ForgeConfigSpec.Builder builder) {
            builder.push("Client Settings");
            cameraShakesAllowed = builder.comment("Setting this to false will disable camera shakes.").define("cameraShakesAllowed", true);
            webbedScreen = builder.comment("Setting this to false will disable the webbed screen overlay", "Requires game restart").worldRestart().define("webbedScreen", true);
            doJumpscare = builder.comment("Setting this to false will disable the jumpscare after killing ragno", "Requires game restart").worldRestart().define("doJumpscare", true);
            arachnophobeMode = builder.comment("Setting this to true will turn on Arachnophobe-Safe Mode, Ragno will become a horrifying monstrosity in a different way").define("arachnophobeMode", false);
            builder.pop();
        }
    }

    public static class CommonConfig {
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> igniter_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> engineer_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> twittollager_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> crocofang_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> absorber_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> preserver_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> magispeller_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> spiritcaller_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> freakager_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> bossrandomizer_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> old_freakager_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends Integer>> old_magispeller_raidcount;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> bossrandomizer_bosstypes;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> bossrandomizer_finalbosstypes;
        public static ForgeConfigSpec.BooleanValue bossrandomizer_onlyOneAllowed;
        public static ForgeConfigSpec.BooleanValue bossrandomizer_seasonalBosses;
        public static ForgeConfigSpec.BooleanValue bossrandomizer_broadcastBossSpawn;
        public static ForgeConfigSpec.BooleanValue boss_music;
        public static ForgeConfigSpec.ConfigValue<Double> magispeller_health;
        public static ForgeConfigSpec.BooleanValue magispeller_onlyOneAllowed;
        public static ForgeConfigSpec.BooleanValue magispeller_forcefield;
        public static ForgeConfigSpec.ConfigValue<Double> spiritcaller_health;
        public static ForgeConfigSpec.BooleanValue spiritcaller_onlyOneAllowed;
        public static ForgeConfigSpec.BooleanValue spiritcaller_forcefield;
        public static ForgeConfigSpec.ConfigValue<Double> freakager_health;
        public static ForgeConfigSpec.ConfigValue<Double> ragno_health;
        public static ForgeConfigSpec.BooleanValue freakager_onlyOneAllowed;
        public static ForgeConfigSpec.BooleanValue freakager_forcefield;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> spiritcaller_stealableMobs;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> spiritcaller_wontAttack;
        public static ForgeConfigSpec.BooleanValue igniter_canBurnBlocks;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> crocofang_rideableMobs;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> devastator_cantBreak;
        public static ForgeConfigSpec.IntValue ghostblock_repairTime;
        public static ForgeConfigSpec.BooleanValue devastator_ghostBlocks;
        public static ForgeConfigSpec.BooleanValue absorber_damageMode;
        public static ForgeConfigSpec.BooleanValue magispeller_balloonAllowed;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> preserver_cannotProtect;
        public static ForgeConfigSpec.ConfigValue<Integer> engineer_machine_limit;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> hinder_excluded;
        public static ForgeConfigSpec.IntValue spellboundbook_rechargeTime;
        public static ForgeConfigSpec.IntValue spellboundbook_effectTime;
        public static ForgeConfigSpec.BooleanValue magispeller_distractEnemies;
        public static ForgeConfigSpec.BooleanValue mobs_watch_intros;
        public static ForgeConfigSpec.ConfigValue<List<? extends String>> banishable_mobs;
        public static ForgeConfigSpec.ConfigValue<Integer> bossbar_type;
        public static ForgeConfigSpec.BooleanValue bosses_darken_sky;

        public static ForgeConfigSpec.BooleanValue nightmare_mode;
        public static ForgeConfigSpec.BooleanValue ULTIMATE_NIGHTMARE;
        public static ForgeConfigSpec.ConfigValue<Double> spiri_damage_multiplier;
        public static ForgeConfigSpec.ConfigValue<Double> freaky_damage_multiplier;
        public static ForgeConfigSpec.ConfigValue<Double> ragno_damage_multiplier;
        public static ForgeConfigSpec.ConfigValue<Double> magi_damage_multiplier;

//    public static final ForgeConfigSpec.ConfigValue<Boolean> spiriWearsArmor;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeSpiriAtAll;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeImps;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeBeam;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeHands;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeSwarm;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> periodicImps;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> createSouls;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> doPhase3;
//    public static final ForgeConfigSpec.ConfigValue<Integer> phase3Duration;
//
//    public static final ForgeConfigSpec.ConfigValue<Boolean> freakyWearsArmor;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> ragnoWearsArmor;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeFreakyAtAll;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeBombs;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeScythe;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeFreakyPotions;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeCandy;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeCough;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeWeb;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeCharge;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeBurrow;
//
//    public static final ForgeConfigSpec.ConfigValue<Boolean> magiWearsArmor;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> magiBossBar;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeMagiAtAll;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeHeal;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeVex;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeDispenser;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeDispenserHealth;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeCrossbow;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeMagiPotions;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeKaboomer;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeLifesteal;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeFireball;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeFangs;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeCrashager;
//    public static final ForgeConfigSpec.ConfigValue<Boolean> changeFakers;

        public CommonConfig(ForgeConfigSpec.Builder builder) {
            ForgeConfigSpec.Builder var10000;
            List<String> var10002;

            builder.push("Mob Settings");

            builder.push("Igniter settings");
            igniter_raidcount = builder.comment("How many Igniters each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("igniter_raidcount", Arrays.asList(0, 0, 1, 2, 0, 2, 1, 4), (s) -> s instanceof Integer);
            igniter_canBurnBlocks = builder.comment("Controls if Igniter should cause block damage with its fireballs.", "As of now its fireballs will still use the normal fire block; basically don't set this to true if you care about your world.", "Default = false", "Note that Igniter's block damage is still affected by the mobGriefing gamerule").define("igniter_canBurnBlocks", false);
            builder.pop();

            builder.push("Twittollager Settings");
            twittollager_raidcount = builder.comment("How many Twittollagers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("twittollager_raidcount", Arrays.asList(0, 0, 0, 0, 1, 0, 2, 1), (s) -> s instanceof Integer);
            builder.pop();

            builder.push("Preserver Settings");
            preserver_raidcount = builder.comment("How many Preservers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("preserver_raidcount", Arrays.asList(0, 0, 0, 1, 2, 0, 3, 4), (s) -> s instanceof Integer);
            var10000 = builder.comment("Illagers the Preserver will ignore.", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Requires game restart");
            var10002 = Arrays.asList("illageandspillage:magispeller", "illageandspillage:spiritcaller", "illageandspillage:freakager");
            Objects.requireNonNull(String.class);
            preserver_cannotProtect = var10000.defineList("preserver_cannotProtect", var10002, String.class::isInstance);
            builder.pop();

            builder.push("Engineer Settings");
            engineer_raidcount = builder.comment("How many Engineers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("engineer_raidcount", Arrays.asList(0, 0, 0, 1, 0, 2, 1, 2), (s) -> s instanceof Integer);
            engineer_machine_limit = builder.comment("Maximum amount of machines the engineer can build", "Set to a negative number to disable limit entirely", "Default = 3").define("engineer_machine_limit", 3);
            var10000 = builder.comment("Raiders in this list will NOT retreat to nearby Hinders when low on health.", "This only affects mobs that extend the \"Raider\" class.", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Requires game restart");
            var10002 = Arrays.asList("minecraft:ravager", "illageandspillage:twittollager", "illageandspillage:absorber", "illageandspillage:crocofang", "illageandspillage:magispeller", "illageandspillage:spiritcaller", "illageandspillage:freakager", "illageandspillage:ragno");
            Objects.requireNonNull(String.class);
            hinder_excluded = var10000.defineList("hinder_excluded", var10002, String.class::isInstance);
            builder.pop();

            builder.push("Absorber Settings");
            absorber_raidcount = builder.comment("How many Absorbers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("absorber_raidcount", Arrays.asList(0, 0, 0, 0, 1, 0, 0, 2), (s) -> s instanceof Integer);
            absorber_damageMode = builder.comment("The damage mode for Absorber.", "On false, Absorber will always take 1 damage from anything. On true, Absorber will take a maximum of 1 damage per hit.", "Default = false").define("absorber_damageMode", false);
            builder.pop();

            builder.push("Crocofang Settings");
            crocofang_raidcount = builder.comment("How many Crocofangs each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("crocofang_raidcount", Arrays.asList(0, 0, 1, 0, 1, 2, 1, 3), (s) -> s instanceof Integer);
            var10000 = builder.comment("Mobs put in this list will be randomly chosen to be the mob riding a Crocofang.", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Invalid entity registry names will have the Crocofang being ridden by nothing. Same goes for if this list is empty", "Only entities extending the Abstract Raider class will actually join the Raid upon spawning", "Requires game restart");
            var10002 = Arrays.asList("minecraft:pillager", "illageandspillage:igniter", "minecraft:vindicator");
            Objects.requireNonNull(String.class);
            crocofang_rideableMobs = var10000.defineList("crocofang_rideableMobs", var10002, String.class::isInstance);
            builder.pop();

            builder.push("Spiritcaller settings");
            spiritcaller_health = builder.comment("Spiritcaller's max health", "Requires game restart", "Default: 160.0").worldRestart().define("spiritcaller_health", 160.0D);
            spiritcaller_raidcount = builder.comment("How many Spiritcallers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("spiritcaller_raidcount", Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), (s) -> s instanceof Integer);
            spiritcaller_onlyOneAllowed = builder.comment("Controls if Spiritcaller should despawn if it spawns in the 7th wave before the bonus wave.", "Overrides spiritcaller_raidcount", "Default = true").define("spiritcaller_onlyOneAllowed", true);
            spiritcaller_forcefield = builder.comment("Should the Spiritcaller only be allowed to fight once all other raiders in the wave are killed?", "Default = true").define("spiritcaller_forcefield", true);
            var10000 = builder.comment("Mobs put in this list have 'souls' the Spiritcaller can steal.", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Requires game restart");
            var10002 = Arrays.asList("minecraft:villager", "minecraft:wandering_trader", "minecraft:pig", "minecraft:cow", "minecraft:sheep", "minecraft:chicken", "minecraft:cat", "minecraft:zombie", "minecraft:husk", "minecraft:skeleton", "minecraft:stray", "minecraft:creeper", "minecraft:spider", "minecraft:enderman");
            Objects.requireNonNull(String.class);
            spiritcaller_stealableMobs = var10000.defineList("spiritcaller_stealableMobs", var10002, String.class::isInstance);
            var10000 = builder.comment("Mobs put in this list won't be attacked by mobs attacking the Spiritcaller, when their souls are taken.", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Only actually happens if the mob is in spiritcaller_stealableMobs", "Requires game restart");
            var10002 = Arrays.asList("minecraft:villager", "minecraft:wandering_trader");
            Objects.requireNonNull(String.class);
            spiritcaller_wontAttack = var10000.defineList("spiritcaller_wontAttack", var10002, String.class::isInstance);
            builder.pop();

            builder.push("Freakager & Ragno Settings");
            freakager_health = builder.comment("Freakager's max health", "Requires game restart", "Default: 160.0").worldRestart().define("freakager_health", 160.0D);
            ragno_health = builder.comment("Ragno's max health", "Requires game restart", "Default: 180.0").worldRestart().define("ragno_health", 180.0D);
            freakager_raidcount = builder.comment("How many Freakagers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("freakager_raidcount", Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), (s) -> s instanceof Integer);
            freakager_onlyOneAllowed = builder.comment("Controls if Freakager should despawn if it spawns in the 7th wave before the bonus wave.", "Overrides freakager_raidcount", "Default = true").define("freakager_onlyOneAllowed", true);
            freakager_forcefield = builder.comment("Should the Freakager only be allowed to fight once all other raiders in the wave are killed?", "Default = true").define("freakager_forcefield", true);
            old_freakager_raidcount = builder.comment("How many Old Freakagers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("oldfreakager_raidcount", Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), (s) -> s instanceof Integer);
            builder.pop();

            builder.push("Magispeller Settings");
            magispeller_health = builder.comment("Magispeller's max health", "Requires game restart", "Default: 250.0").worldRestart().define("magispeller_health", 250.0D);
            magispeller_raidcount = builder.comment("How many Magispellers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("magispeller_raidcount", Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), (s) -> s instanceof Integer);
            magispeller_onlyOneAllowed = builder.comment("Controls if Magispeller should despawn if it spawns in the 7th wave before the bonus wave.", "Overrides magispeller_raidcount", "Default = true").define("magispeller_onlyOneAllowed", true);
            magispeller_forcefield = builder.comment("Should the Magispeller only be allowed to fight once all other raiders in the wave are killed?", "Default = true").define("magispeller_forcefield", true);
            magispeller_balloonAllowed = builder.comment("Determines if Magispeller is allowed to use balloons to break his fall.", "Default = true").define("magispeller_balloonAllowed", true);
            magispeller_distractEnemies = builder.comment("Determines if Magispeller's death animation should distract other-team mobs. Mainly for Mob Battles.", "Default = true").define("magispeller_distractEnemies", true);
            old_magispeller_raidcount = builder.comment("How many Old Magispellers each wave", "Requires game restart", "Must have no more and no less than 8 integers").worldRestart().defineList("oldmagispeller_raidcount", Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0), (s) -> s instanceof Integer);
            builder.pop();

            builder.push("Devastator Settings");
            var10000 = builder.comment("Blocks the Devastator can't break.", "Format must be like 'examplemod:block'. Example: \"minecraft:bedrock\"", "You can use the /setblock command to scroll through and find the IDs for blocks you want!", "Invalid registry names will do nothing, so if you notice the Devastator is destroying a block it shouldn't, check this list for errors", "Requires game restart");
            var10002 = Arrays.asList("minecraft:obsidian", "minecraft:bedrock", "minecraft:command_block", "minecraft:chain_command_block", "minecraft:repeating_command_block", "minecraft:barrier");
            Objects.requireNonNull(String.class);
            devastator_cantBreak = var10000.defineList("devastator_cantBreak", var10002, String.class::isInstance);
            devastator_ghostBlocks = builder.comment("Controls if Devastator should leave behind ghost blocks in its destruction", "Don't set this to true if you care about your world.", "Default = false", "Note that Devastator's block damage is still affected by the mobGriefing gamerule").define("devastator_ghostBlocks", false);
            ghostblock_repairTime = builder.comment("Time that Ghost Blocks take to repair", "Default = 6000 (5 minutes)").defineInRange("ghostblock_repairTime", 6000, 1, Integer.MAX_VALUE);
            builder.pop();

            builder.push("Boss Randomizer Settings");
            bossrandomizer_raidcount = builder.comment("How many Boss Randomizers each wave", "Requires game restart", "Must have no more and no less than 8 integers", "Note that Boss Randomizers on the final Raid wave will be considered the 'Final Boss'").worldRestart().defineList("bossrandomizer_raidcount", Arrays.asList(0, 0, 0, 0, 1, 0, 0, 1), (s) -> s instanceof Integer);
            var10000 = builder.comment("Mobs put in this list will be randomly selected by the Boss Randomizer.", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Invalid entity registry names will spawn the boss randomizer itself as an illager. Same goes for if this list is empty", "Only entities extending the Abstract Raider class will actually join the Raid upon spawning", "Requires game restart");
            var10002 = Arrays.asList("illageandspillage:spiritcaller", "illageandspillage:freakager");
            Objects.requireNonNull(String.class);
            bossrandomizer_bosstypes = var10000.defineList("bossrandomizer_bosstypes", var10002, String.class::isInstance);
            var10000 = builder.comment("Mobs put in this list will be randomly selected by the Final Boss Randomizer. Only insanely powerful mobs like the Magispeller should go here", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Invalid entity registry names will spawn the boss randomizer itself as an illager. Same goes for if this list is empty", "Only entities extending the Abstract Raider class will actually join the Raid upon spawning", "Requires game restart");
            var10002 = List.of("illageandspillage:magispeller");
            Objects.requireNonNull(String.class);
            bossrandomizer_finalbosstypes = var10000.defineList("bossrandomizer_finalbosstypes", var10002, String.class::isInstance);
            bossrandomizer_onlyOneAllowed = builder.comment("Controls if the Boss Randomizer should despawn if it spawns in the 7th wave before the bonus wave.", "Overrides bossrandomizer_raidcount", "Default = true").define("bossrandomizer_onlyOneAllowed", true);
            bossrandomizer_seasonalBosses = builder.comment("Should Boss Randomizer be allowed to spawn special bosses depending on the calendar date?", "Default = true").define("bossrandomizer_seasonalBosses", true);
            bossrandomizer_broadcastBossSpawn = builder.comment("Should Boss Randomizer broadcast the spawning of a boss with a sound?", "Default = true").define("bossrandomizer_broadcastBossSpawn", true);
            builder.pop();

            builder.pop();

            builder.push("Item Settings");
            spellboundbook_rechargeTime = builder.comment("Time in minutes that the Spellbound Book will go into cooldown for.", "Default = 60 (1 hour)", "Set to 0 to disable cooldown").defineInRange("spellboundbook_rechargeTime", 60, 0, Integer.MAX_VALUE);
            spellboundbook_effectTime = builder.comment("Time in minutes that the Spellbound Book gives Misconduction for.", "Default = 40").defineInRange("spellboundbook_effectTime", 40, 1, Integer.MAX_VALUE);
            var10000 = builder.comment("Mobs in this list can be banished using the Totem of Banishment", "Format must be like 'examplemod:entity'. Example: \"minecraft:zombie\"", "You can use the /summon command to scroll through and find the IDs for mobs you want!", "Requires game restart");
            var10002 = List.of("minecraft:vex");
            Objects.requireNonNull(String.class);
            banishable_mobs = var10000.defineList("banishable_mobs", var10002, String.class::isInstance);
            builder.pop();

            builder.push("Misc settings");
            boss_music = builder.comment("Whether or not to play boss music", "Default = true").define("boss_music", true);
            bossbar_type = builder.comment("Determines how to display bossbars for bosses:", "0 = Never show", "1 = Only show outside of raids", "2 = Always show", "3 = Change raid bossbar to boss name and health (NOTE: May cause issues with other mods that change the raid bossbar)", "Requires game restart", "Default = 3").worldRestart().define("bossbar_type", 3);
            bosses_darken_sky = builder.comment("Whether or not the sky should darken when a boss' bossbar is displayed", "Requires game restart", "Default = true").worldRestart().define("bosses_darken_sky", true);
            mobs_watch_intros = builder.comment("Determines if mobs will run away and then watch a boss while it performs its intro animation. Mainly for Mob Battles.", "Default = true").define("mobs_watchIntros", true);
            builder.pop();

            builder.push("Nightmare Mode");
            nightmare_mode = builder.comment("Nightmare Mode increases damage, resistance, and revamps attacks of all bosses to make them significantly harder", "See the \"Harder Illage and Spillage\" mod on Curseforge for more info about the changes", "Requires game restart", "THIS IS VERY UNFINISHED! ONLY THE CONFIG OPTIONS BELOW HAVE BEEN IMPLEMENTED!", "Default = false").worldRestart().define("nightmare_mode", false);

            builder.push("Spiritcaller settings");
            spiri_damage_multiplier = builder.comment("The Spiritcaller's damage will be multiplied by this number", "Only applies when Nightmare Mode is enabled", "Default: 2.5").define("spiritcaller_damage_multiplier", 2.5D);
            builder.pop();

            builder.push("Freakager & Ragno settings");
            freaky_damage_multiplier = builder.comment("The Freakager's damage will be multiplied by this number", "Only applies when Nightmare Mode is enabled", "Default: 2.5").define("freakager_damage_multiplier", 2.5D);
            ragno_damage_multiplier = builder.comment("Ragno's damage will be multiplied by this number", "Only applies when Nightmare Mode is enabled", "Default: 5.0").define("ragno_damage_multiplier", 5.0D);
            builder.pop();

            builder.push("Magispeller settings");
            magi_damage_multiplier = builder.comment("The Magispeller's damage will be multiplied by this number", "Only applies when Nightmare Mode is enabled", "Default: 2.5").define("magispeller_damage_multiplier", 2.5D);
            builder.pop();

            ULTIMATE_NIGHTMARE = builder.comment("ULTIMATE NIGHTMARE replaces all mobs (except the few required to beat the game) with a random I&S mob (including bosses)", "Needless to say, don't set this to true if you care about your world", "Default = false").worldRestart().define("ULTIMATE NIGHTMARE", false);
            builder.pop();
        }
    }
}
