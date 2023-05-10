package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;

import de.itagile.golf.befehl.BeendenBefehl;
import de.itagile.golf.befehl.HilfeBefehl;
import de.itagile.golf.befehl.LochwechselBefehl;
import de.itagile.golf.befehl.SchlagBefehl;
import de.itagile.golf.befehl.ScorecardBefehl;
import de.itagile.golf.operation.BefehleRepo;

public class BefehleSammler implements BefehleRepo {

	@Override
	public List<Befehl> sammle() {
		List<Befehl> ernte = new ArrayList<>();
		ernte.add(new SchlagBefehl());
		ernte.add(new LochwechselBefehl());
		ernte.add(new HilfeBefehl(this));
		ernte.add(new ScorecardBefehl());
		ernte.add(new BeendenBefehl());
		return ernte;
	}
}
