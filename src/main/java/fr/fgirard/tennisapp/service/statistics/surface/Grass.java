package fr.fgirard.tennisapp.service.statistics.surface;

import java.util.List;
import java.util.stream.Collectors;

import fr.fgirard.tennisapp.domain.Score;

public class Grass extends SurfaceBO {

	public Grass(final List<Score> pScores) {
		super(pScores);
	}

	@Override
	protected List<Score> filter(final List<Score> pScores) {
		return pScores.stream()
				.filter(score -> ConstantsSurface.GRASS.equals(score.getTournament().getSurface().getSurface()))
				.collect(Collectors.toList());
	}


}